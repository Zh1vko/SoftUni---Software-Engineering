package CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable{


    @Override
    public String remove() {
        if (items.size() > 0)   {
            String removeString = items.get(items.size()-1);
            super.items.remove(removeString);
            return removeString;
        }
        return "No more elements!";
    }

    @Override
    public int add(String item) {
        super.items.add(0, item);
        return 0;
    }
}
