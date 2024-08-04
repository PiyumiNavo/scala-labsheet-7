@main def main():Unit = {
    val numbers = List(1,2,3,4,5,6,7,8,9,10)
    println(filterEvenNumbers(numbers))
}



def filterEvenNumbers(numbers:List[Int]) = numbers.filter((x:Int) => x % 2 == 0)