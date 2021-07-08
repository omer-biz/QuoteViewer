public class QuoteRepository implements Container {
    @Override
    public Iterator getIterator() {
       return new QuoteIterator();
    }
    private class QuoteIterator implements Iterator {
 
       int index;
 
       @Override
       public boolean hasNext() {
       
          if(index < quotes.length){
             return true;
          }
          return false;
       }

       @Override
       public Object next() {
           
           if (prevcalled == 0) {
               index++;
           }
       
          prevcalled = 1;
          if(this.hasNext()){
             return quotes[index++];
          }
          return null;
       }
      @Override
      public boolean hasPrev() {
          if(index > 0) {
                return true;
           }
           return false;
       }
 
       @Override
       public Object prev() {
           if(prevcalled == 1) {
               index--;
           }
           prevcalled = 0;
           if(this.hasPrev()) {
               return quotes[--index];
           }
           return null;
       }

  
     }
}
