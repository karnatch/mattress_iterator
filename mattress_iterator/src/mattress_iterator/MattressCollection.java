package mattress_iterator;

class MattressCollection implements Collection
{
static final int MAX_ITEMS = 9;
int numberOfItems = 0;
Mattress[] mattList;

public MattressCollection()
{
	mattList = new Mattress[MAX_ITEMS];

   addItem("Hybrid");
   addItem("Inner-spring");
   addItem("Latex");
}

public void addItem(String str)
{
	Mattress matt = new Mattress(str);
   if (numberOfItems >= MAX_ITEMS)
       System.err.println("Full");
   else
   {
	   mattList[numberOfItems] = matt;
       numberOfItems = numberOfItems + 1;
   }
}



public Iterator createIterator()
{
   return new MattressIterator(mattList);
}
}
