package libraryandbook

data class Book(
    val title: String,
    val price: Int,
    val author: String
) : Comparable<Book> {
    override fun compareTo(other: Book) = compareValuesBy(this, other,
    { it.title },
    { it.price },
    { it.author }
    )
}