
fun main()
{
    val denis = Person("Denis" , "Suarez", 24)                //"Initialized a new Person object with First Name = Denis and Last Name = Suarez"
    denis.hobby = "Playing football"
    print("Denis Suarez is ${denis.age} years old")
    denis.stateHobby("Denis")                                   // "His hobby is Playing Football"
    denis.age = 30

    var john = Person()                               //"Initialized a new Person object with First Name = John and Last Name = Doe"
    var johnPeterson = Person(lastname = "Peterson") //"Initialized a new Person object with First Name = John and Last Name = Peterson"


    myFunction(5)
}


//class Person(firstname: String, lastname: String)
class Person constructor(firstname: String = "John", lastname: String = "Doe")
{
    //Member variable - Properties
    var age : Int? = null
    var hobby : String = "Playing Instruments"
    var firstname : String? = null
    var lastname : String? = null


    //lateinit keyword
    lateinit var owner : String
    lateinit var owner2: String


    //Initializer Block
    init{
        //lateinit initialization
        this.owner = firstname
        this.owner2 = lastname

        //normal initialization
        this.firstname = firstname
        this.lastname = lastname
        println("Initialized a new Person object with "+
                "First Name = $firstname and Last Name = $lastname")
    }
    //Secondary constructor
    constructor(firstname: String, lastname: String, age:Int): this(firstname, lastname)
    {
        this.age = age
    }

    //Member functions - Methods
    fun stateHobby(firstname: String)
    {
        if(firstname[firstname.length-1] == 's')
            println("$firstname\' hobby is $hobby")
        else
            println("$firstname\'s hobby is $hobby")
    }
}

//Scope and Shadowing
//this a is a parameter
fun myFunction(a:Int)
{
      //a = 5 -> compilation error
     //a is a variable
    var a = 5
    println("a is $a")

    a = a               //This is called Shadowing
    println("a is $a")
}