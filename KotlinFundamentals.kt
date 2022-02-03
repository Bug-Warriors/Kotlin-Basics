import java.security.KeyStore

fun main()
{
    /*  TYPE       */
    /*  INFERENCE  */

    var myName = "Arnav"
    print("Hello $myName\n")

    myName = "Shrarn"
    print("Hello $myName")

    /*  WITHOUT   */
    /*  TYPE      */
    /*  INFERENCE */

    //Integer type Data types
    var myByte: Byte = 18
    var myShort: Short = 145
    var myInt: Int = 123_123_2832
    var myLong: Long = 1231_7903_712_9381


    //Floating Point Type Data types
    var myFloat: Float = 15.78F
    var myDouble : Double = 1267.78787


    //Boolean type Data types
    var isSunny: Boolean = true
    isSunny = false


    //Character type Data type
    var letterChar: Char ='A'
    var letterChar2: Char = '1'


    //String type Data Type
    val myStr: String = "Hello World!"
    val firstCharInString = myStr[0]
    val lastCharInString = myStr[myStr.length - 1]

    print("First character of the String :$firstCharInString")
    print("Last character of the String :$lastCharInString")

    //Arithmetic Operator(+, -, *, /, %)
    var result = 8

    //result = result + 2
    result+=2
    print(result)

    //result = result / 2
    result/=2
    print(result)

    //result = result * 2
    result*=2
    print(result)

    //result = result - 2
    result -=2
    print(result)

    //result = result % 2
    result%=2
    print(result)

    /*
        <value>.to<Data Type>() Functions
     */

    var a = 678

    //Conversion to Integer type Date Types
    var b = 'A'.code                                                                //Output: 65
    var c = 3.14f.toInt()
    var d = 72837283.toLong()
    var e = 12.toShort()
    var f = 1.toByte()

    //Conversion to Floating Point Data Types
    var g = 21.toFloat()
    var h = 898.toDouble()

    //Conversion to Boolean Data Type
    var i = "false".toBoolean()
    var j = "true".toBoolean()

    //Conversion to Character Data Type
    var k = 1.toChar()
    var l = 2.5.toInt().toChar()

    //Conversion to String Data Type
    var m = 'H'.toString()
    var n = 120.toString()
    var o = true.toString()
    var p = 2.13.toString()


    //Comparison operators( ==, !=, <, >, <=, >=)
    //Equals
    var isEqual = 5==3 //Returns: false
    isEqual = 10==10   //Returns: true

    //Not Equals
    var isNotEqual = 5!=5 //Returns: false
    isNotEqual = 3!=5     //Returns: true

    //Lesser than
    var isLesserThan = 3<5 //Returns: true
    isLesserThan = 5<3     //Returns: false

    //Greater than
    var isGreaterThan = 5>3//Returns: true
    isGreaterThan = 3>5    //Returns: false

    //Lesser or Equals to
    var isLessEquals = 5<=2//Returns: false
    isLessEquals = 2<=2    //Returns: true


    //String interpolation
    println("Is -5 greater than 3 ${-5>3}")
    println("Is 5 Lesser or Equals to 3 ${5>3}")


    //Assignment Operators (+=, -=, *=, /=, %=)
    var variable =5
    variable +=2    //Same as variable = variable + 2
    variable -=2    //Same as variable = variable - 2
    variable *=3    //Same as variable = variable * 3
    variable /=3    //Same as variable = variable / 3
    variable %=5    //Same as variable = variable % 5


    //Increment & Decrement operators (++, --)
    variable++  //Same as variable = variable + 1
    println("variable = $variable")

    variable--  //Same as variable = variable - 1
    println("variable = $variable")
    //++variable or --variable also exists

    val constant = 10


    //if - else if - else
    if(variable > constant)
    {
        print("Hello")
    }
    else if(variable == constant)
    {
        print("Bye")
    }
    else
    {
        print("Hey")
    }

    var name = "Dennis"

    if(name == "Dennis"){
        print("Name is: $name")}
    else{
        print("Name is unknown!")}

    //if else statements as expressions
    var answer = if(name=="Dennis"){
        name
    }


    //when expression instead of if - else if - else statement
    var season = 3
    when(season){
        1 -> print("Spring")
        2 -> print("Summer")
        3 -> {
            print(" Fall/Autumn")
        }
        4 -> print("Winter")
        else -> print("Invalid Season")
    }


    //in keyword (i.e decribes range)
    var month =3
    when(month){
        in 3..5 -> print("Spring")
        in 6..8 -> print("Summer")
        in 9..11 -> print("Fall")
        12, 1, 2 -> print("Winter")
        else -> print("invalid season")
    }


    //is keyword (i.e checks data type)
    var x : Any = 13.37
    when(x)
    {
        is Int -> print("$x is an Int")
        !is Double -> print("$x is not a Double")
        is String ->  print("$x is none of the above")
        else -> print("$x is none of the above")
    }

 
    //while loop
    var condition = true
    while(condition){
        println("$x")
        condition = false
    }


    var x = 1
    while(x<=10)
    {
        println("$x")
        x++
    }

    var feltTemp = "Cold"
    var roomTemp = 10
    while(feltTemp == "Cold")
    {
        roomTemp++
        if(roomTemp>=20)
        feltTemp= "Comfy"
        else
        print("It is cold with $roomTemp degree celsius")
    }
    print("It is comfy with $roomTemp degree celsius")


    //do-while loop

    do{
        println("Do while $x")
        x--
    }while(x>=0)


    //for loops
    for(num in 1..10)
    {
        print("$num")
    }

    for(i in 1 until 10)
    {
        print("$1")
    }

    for(i in 10 downTo 1 step 2)
    {
        print ("$1")
    }

}
