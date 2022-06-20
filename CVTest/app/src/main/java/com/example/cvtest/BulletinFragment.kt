package com.example.cvtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class BulletinFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_bulletin, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        var listUser = arrayListOf<User>()
        listUser.add(User("You", "23 Maret 2022 - 00:41 WIB","Algebra Theory 1","25 Maret 2022 - 00:01 WIB","Pellentesque ut tellus luctus, fermentum justo quis, lobortis mi. Praesent volutpat odio non neque iaculis condimentum. Aenean arcu leo, sollicitudin vel pulvinar vel, fermentum ut dolor","4 Attachments"))
        listUser.add(User("You", "23 Maret 2022 - 00:41 WIB","Algebra Theory 1","25 Maret 2022 - 00:01 WIB","Pellentesque ut tellus luctus, fermentum justo quis, lobortis mi. Praesent volutpat odio non neque iaculis condimentum. Aenean arcu leo, sollicitudin vel pulvinar vel, fermentum ut dolor","1 Module"))

        var adapter = RecyclerAdapter(listUser)
        recyclerView.layoutManager = LinearLayoutManager(view.context)

        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapter
        return view
    }


}