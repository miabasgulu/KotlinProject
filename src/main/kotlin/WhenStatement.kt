fun main(){

    val alarm = 17

    when(alarm) {
        6 -> println("Wake up!!! it is $alarm - time to go")
        7 -> println("It is $alarm - BREAKFAST time")
        8 -> println("It is $alarm - time to leave home")
        9 -> println("It is $alarm - time to start working")
        12 -> println("It is $alarm - LUNCH time")
        17 -> println("It is $alarm - time to leave work")
        19 -> println("It is $alarm - DINNER time")
        22 -> println("It is $alarm - time to go to bed")
        else -> println("FREE TIME - get some rest")
    }

    println("---------------------------------------------------------------------------")

    when(alarm){
        6,7,8,9 -> println("It is $alarm - time before work")
        17,19,22 -> println("It is $alarm - time after work")
        else -> println("It is $alarm - time time is not planned")
    }

    println("---------------------------------------------------------------------------")

    when(alarm){
        !in 5..10 -> println("It is $alarm - time is in range 5 to 10")
        else -> println("It is $alarm - time is NOT in range")
    }

    println("---------------------------------------------------------------------------")

    when(alarm){
        in 10..20 -> {
            println("It is $alarm - time is in range 10 to 20")
            println("This condition is met")
        }
        else -> {
            println("It is $alarm - time is NOT in range")
            println("Else block is ran")
        }
    }

    println("---------------------------------------------------------------------------")

    when {
        alarm < 10 -> println("It is $alarm - Morning time")
        alarm >= 17 && alarm <= 19 -> println("It is $alarm - Evening time")
        else -> println("It is $alarm - time is not planned")
    }

    println("---------------------------------------------------------------------------")

    val whenCondition = when(alarm){
        in 6..12 -> "It is $alarm - Good morning"
        in 17..19 -> "It is $alarm - Good evening"
        else -> "It is $alarm - time is not planned - RELAX!!!"
    }
    println(whenCondition)
}