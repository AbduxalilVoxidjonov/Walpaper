package uc.team.walpaper.ui.random

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import uc.team.walpaper.CustomAdapterRecycleview
import uc.team.walpaper.databinding.FragmentRandomBinding

class RandomFragment : Fragment() {
  private val binding by lazy { FragmentRandomBinding.inflate(layoutInflater) }
    private lateinit var arrayList: ArrayList<String>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        download1()
        val customAdapter = CustomAdapterRecycleview(arrayList)
        binding.randomRecyclerView.layoutManager = GridLayoutManager(context, 3)
        binding.randomRecyclerView.adapter = customAdapter

        return binding.root
    }
    fun download1(){
        arrayList = arrayListOf<String>()
        arrayList.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg")
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYOrBblqRsySBBKa4ZiT6UWEXq4D_UgQ7ibiUIzXtL&s")
        arrayList.add("https://www.google.com/url?sa=i&url=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fbook&psig=AOvVaw07Mx_NSapmqn2KDo765QMq&ust=1691342115205000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCNCJrcGCxoADFQAAAAAdAAAAABAY")
        arrayList.add("https://media.istockphoto.com/id/1146517111/photo/taj-mahal-mausoleum-in-agra.jpg?s=612x612&w=0&k=20&c=vcIjhwUrNyjoKbGbAQ5sOcEzDUgOfCsm9ySmJ8gNeRk=")
        arrayList.add("https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014_640.jpg")
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3o-4GCcROl4MjYjWS76bqF1adLnoxFtnKFmlz8KCX&s")
        arrayList.add("https://www.befunky.com/images/prismic/1f427434-7ca0-46b2-b5d1-7d31843859b6_funky-focus-red-flower-field-after.jpeg?auto=avif,webp&format=jpg&width=863")
        arrayList.add("https://media.istockphoto.com/id/517188688/photo/mountain-landscape.jpg?s=612x612&w=0&k=20&c=A63koPKaCyIwQWOTFBRWXj_PwCrR4cEoOw2S9Q7yVl8=")
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgH7UpbEFAJw2tMHfBK0z6c_KsgoYhJaBuvUI7Av_F&s")
        arrayList.add("https://image.shutterstock.com/image-photo/mountains-under-mist-morning-amazing-260nw-1725825019.jpg")
        arrayList.add("https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80")
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdVryfA8aqQc_XyopPF2YIGDdZy-HPVEniGS_L313xHsKmX2-6lBy0iYS7D_2G3YAHoH4&usqp=CAU")
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPCXISA7AWonO3J24GKCgtJ9e4OTuaJHSBM7rcN3j28GfR6eJAJTe1Gi_AlJpG6wuFnCs&usqp=CAU")
        arrayList.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg")
        arrayList.add("https://st4.depositphotos.com/17442418/21581/i/600/depositphotos_215816982-stock-photo-female-photographer-long-hair-taking.jpg")
        arrayList.add("https://images.unsplash.com/photo-1495344517868-8ebaf0a2044a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YWxvbmV8ZW58MHx8MHx8fDA%3D&w=1000&q=80")
        arrayList.add("https://img.freepik.com/free-photo/painting-mountain-lake-with-mountain-background_188544-9126.jpg?q=10&h=200")
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3o-4GCcROl4MjYjWS76bqF1adLnoxFtnKFmlz8KCX&s")
        arrayList.add("https://cdn.pixabay.com/photo/2015/04/19/08/32/rose-729509_640.jpg")
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9YYh5Fk1u9VsWWr1MhkyQeOzeNbtnnMO96g&usqp=CAU")
        arrayList.add("https://images.unsplash.com/photo-1564906527851-a0dbcff597f1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHx8&w=1000&q=80")
        arrayList.add("https://images.unsplash.com/photo-1628776620361-2f32d55d36c7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE5fHx8ZW58MHx8fHx8&w=1000&q=80")
        arrayList.add("https://images.unsplash.com/photo-1621924239958-8815bd30e670?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHx8&w=1000&q=80")
        arrayList.add("https://i.insider.com/60638bd66183e1001981966a?width=1136&format=jpeg")
    }
}