//19001568
import scala.math.sqrt

object caseClass extends App {
  
  case class point(a:Int,b:Int){
      def x:Int=a;
      def y:Int=b;
      def add(p2:point)={point(this.x+p2.x,this.y+p2.y)}
      def move(dx:Int,dy:Int)={point(this.x+dx,this.y+dy)}
      def distance(p2:point){point(sqrt((this.x*this.x-p2.x*p2.x)+(this.y*this.y-p2.y*p2.y)).toInt,0)}
      def invert()={point(-1*this.x,-1*this.y)}
      }

      
  val p1=point(1,2);
  val p2=point(2,3);
  println("1st point:"+p1);
  println("2nd point:"+p2);
  println("After adding p1 and p2:"+p1.add(p2));
  println("After move p1:"+p1.move(10,11));
  println("distance of p1 and p2:"+(p1.distance(p2)));
  println("invert of p1:"+p1.invert());
  println("invert of p2:"+p2.invert());
 
  


   
  
}