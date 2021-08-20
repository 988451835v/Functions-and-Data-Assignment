object MyApp3 extends App {
  val a1 = new Account("df", 2, 1200)

  println("My Account" ,a1)

  println("Enter the Account id you want to transfer")
  val gid=(scala.io.StdIn.readLine)
  println("Enter the Account no you want to transfer")
  val gno=(scala.io.StdIn.readLine).toInt
  println("Enter the Account amount you want to transfer")
  val gac=(scala.io.StdIn.readLine).toInt

  val a2=new Account(gid,gno,gac)
  println("Given Account",a2)

  println("Enter the amount you want to transfer")
  val amount=(scala.io.StdIn.readLine).toDouble

  println("------------------------------------------------------")

  println("After transferring balance of your account ")
  println(a1.transfer1(a1,amount))
  println("After transferring balance of given account ")
  println(a2.transfer2(a2,amount))


  var bank: List[Account] = List()

  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val number: Int = n
    var balance: Double = b

    //    def transfer( amount : Double , that : Account ): Unit = {
    //      this.balance =  this.balance - amount
    //      that.balance = that.balance + amount
    //    }

    def transfer1(a:Account,b:Double)=this.balance-amount
    def transfer2(a:Account,b:Double)=this.balance+amount


    override def toString = "[" + nic + ":" + number + ":" + balance + ".]"
  }
}





