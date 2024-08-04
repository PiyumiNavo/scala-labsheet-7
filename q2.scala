@main def main():Unit = {
    val list = List(1,2,3,4,5,6,7,8,9,10)
    println(calculateSquare(list))
}

def calculateSquare(list:List[Int]):List[Int] = list.map((e) => e*e)