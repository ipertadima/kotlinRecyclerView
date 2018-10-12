package google.co.id.basicrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val data = mutableListOf("aaaa", "aaaaa")
    private var mainAdapter: MainAdapter = MainAdapter(data)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(rv_main) {
            adapter = mainAdapter
            //linear vertical layout manager
            //layoutManager = LinearLayoutManager(this@MainActivity)

            //grid layout manager vertical
            //layoutManager = GridLayoutManager(this@MainActivity, 2)

            //grid layout manager
            layoutManager = GridLayoutManager(this@MainActivity, 2, GridLayoutManager.HORIZONTAL,
                    false)
        }
        setData()
    }

    private fun setData() {
        data.add("Data 1")
        data.add("Data 2")
        data.add("Data 3")
        mainAdapter.notifyDataSetChanged()
    }
}
