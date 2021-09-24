package mattress_iterator;

class Dealer
{
	MattressCollection matt;

public Dealer(MattressCollection matt)
{
   this.matt = matt;
}

public void printMatt()
{
   Iterator iterator = matt.createIterator();
   System.out.println("-------Dealer Stock------------");
   while (iterator.hasNext())
   {
	   Mattress m = (Mattress)iterator.next();
       System.out.println(m.getMatt());
   }
}
}
