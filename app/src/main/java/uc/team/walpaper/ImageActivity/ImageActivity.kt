package uc.team.walpaper.ImageActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.squareup.picasso.Picasso
import uc.team.walpaper.R
import uc.team.walpaper.ui.like.LikeFragment

class ImageActivity : AppCompatActivity() {
    private val binding by  lazy { uc.team.walpaper.databinding.ActivityImageBinding.inflate(layoutInflater) }

    private  var bool:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val name=intent.getStringExtra("image")
        Picasso.get().load(name).into(binding.imagesView)
        binding.apply {
            infoButton.setOnClickListener {
                bottomButtons.visibility= View.GONE
                infoButton.visibility= View.GONE
                shareButton.visibility= View.GONE
                backButton.visibility= View.GONE
                infoClose.visibility= View.VISIBLE
                infoImageCard.visibility = View.VISIBLE
            }
            infoClose.setOnClickListener {
                bottomButtons.visibility= View.VISIBLE
                infoButton.visibility= View.VISIBLE
                shareButton.visibility= View.VISIBLE
                backButton.visibility= View.VISIBLE
                infoClose.visibility= View.GONE
                infoImageCard.visibility = View.GONE
            }
            backButton.setOnClickListener{
                finish()
            }

            likeButton.setOnClickListener {
                if (bool){
                    likedImage.setImageResource(R.drawable.select_like)
                    bool=false
                    LikeFragment().apply {
                        arguments?.putString("like", name.toString())
                    }
                }else{
                    likedImage.setImageResource(R.drawable.default_like)
                    LikeFragment().apply {
                        arguments?.putString("like", name.toString())
                    }
                    bool=true
                }
            }

        }
    }
}