@main def main():Unit = {
    val list = List(1,2,3,4,5,6,7,8,9,10)
    println(filterPrime(list))
}

def isPrime(num: Int, divisor: Int = -1): Boolean = {
  if (num <= 1) false
  else if (divisor == -1) isPrime(num, num - 1)
  else if (divisor == 1) true
  else if (num % divisor == 0) false
  else isPrime(num, divisor - 1)
}

def filterPrime(list:List[Int]):List[Int] = list.filter((x:Int) => isPrime(x))