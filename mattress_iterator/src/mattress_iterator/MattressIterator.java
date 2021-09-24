package mattress_iterator;

class MattressIterator implements Iterator
{
	Mattress[] mattList;

int pos = 0;

public  MattressIterator (Mattress[] mattList)
{
   this.mattList = mattList;
}

public Object next()
{
	Mattress matt =  mattList[pos];
   pos += 1;
   return matt;
}

public boolean hasNext()
{
   if (pos >= mattList.length ||
		   mattList[pos] == null)
       return false;
   else
       return true;
}
}

