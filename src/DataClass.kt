data class DataClass(private var _type: String?,
                     val size: String,
                     private var _price: Double) {

    //init block is for default constructor initialization
    //Below example shows the null handling using 'Elvis Operator'
    //TODO uncommented because the getter below will handle it..
//    init {
//        //You can handle the below's constructor null using 'Elvis Operator'
//        _type = _type?.toUpperCase() ?: "Unknown"
//    }

    //Defining explicit getters and setters
    //TODO this is the one we talked about above
    var type: String? = _type
        get() = field ?: "Unknown"

    //An example showing 10% discount on the clothes
    var price: Double = _price
        set(value) {
            field = value.times(0.9)
        }

    //We can do constructor overloading too...
    constructor(size: String, price: Double) : this(null, size, price) {
        //For this constructor you can execute code here...

    }

}