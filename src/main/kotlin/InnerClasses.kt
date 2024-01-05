class ListView(val items: Array<String>){

    inner class ListViewItem(){
        fun displayItem(position: Int){
            println(items[position])
        }
    }

}


fun main() {

    val listView = ListView(arrayOf("Item1", "Item2", "Item3", "Item4"))

    listView.ListViewItem().displayItem(3)
}