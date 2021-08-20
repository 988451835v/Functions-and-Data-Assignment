object MyApp4 extends App {

  var bank : List[Account] = List( new Account("Nishedha" , 1 , -200.00) , new Account("Hashini" , 2 , 2000.00) )
  val find = ( n : Int , b : List[Account]) => b.filter( x => x.accountNumber.equals( n ))
  val overdraft = ( b : List[Account] ) => b.filter( x => x.balance < 0)
  val balance = ( b: List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )
  val interest = ( b : List[Account] ) => b.map( x => {
    x.balance match {
      case a if a >= 0 => deposit(x.balance* 0.05)
      case _ => withdraw(x.balance*0.1)

    }
    x
  })

    class Account(id: String, n: Int, b: Double) {
      val nic: String = id
      val accountNumber: Int = n
      var balance: Double = b
    }

  def withdraw(amount:Double) : Double = {
        this.balance = this.balance - amount
      }

  def deposit(amount:Double) : Double = {
        this.balance = this.balance + amount
      }



  println("Your bank ", bank )
  println()
  println("Your find ",find( 2 , bank) )
  println()
  println("Your overdraft  ",overdraft( bank ) )
  println()
  println("Your balance ",balance( bank )._2 )
  println()

  bank = interest( bank )

  println("Then your bank ", bank )
  println()
  println("Your balance ",balance( bank )._2 )
  println()

}
