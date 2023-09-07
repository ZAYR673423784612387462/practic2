fun main(args: Array<String>) {
    println("Hello World!")
//task 1
    val age1: Int = 42;
    val age2: Int = 21;
    println(age1);
    println(age2);

//task 2
    val avg1: Int = (42 + 21) / 2;
    println(avg1);
    // ответ выводится без остатка


//task 3
    val avg2: Double = (42.0 + 21.0) / 2;
    println(avg2);


//task 4
    val firstName: String = "artem";
    val lastName: String = "kirya";
    println(firstName);
    println(lastName);

//task 5
    val fullName: String = lastName + " " + firstName;
    println(fullName);

//task 6
    val myDetails: String = "привет, меня зовут " + fullName;
    println(myDetails);

//task 7 - 8- 9
    val beta = Triple(9, 7, 2023);
    val mes = beta.first;
    val den = beta.second;
    val god = beta.third;
    println(beta);
    println("mes: $mes, god: $god");

//task 10
    val alpha: Pair<Int, Int> = Pair(12, god);
    println(alpha);
}





