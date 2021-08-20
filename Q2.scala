object MyApp2 extends App{
  val r1=new Rational2(3,4)
  val r2=new Rational2(5,8)
  val r3=new Rational2(2,7)
  val x=r1-r2-r3
  println("First number",r1)
  println("Second number",r2)
  println("Third number",r3)
  println("After deduction r1-r2-r3 =",x)

}

class Rational2(n:Int,d:Int){
  require(d>0,"d must be grater than 0")
  def numer=n/gcd(Math.abs(n),d)
  def denom=d/gcd(Math.abs(n),d)
  def this(n:Int)=this(n,1)

  //def neg=new Rational2(-this.numer,this.denom)
  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
  //def +(r:Rational2)=new Rational2(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)
  //def neg=new Rational2(-this.numer,this.denom)
  def -(r:Rational2)=new Rational2(this.numer*r.denom-this.denom*r.numer,this.denom*r.denom)
  override def toString = numer + "/" +denom

}


