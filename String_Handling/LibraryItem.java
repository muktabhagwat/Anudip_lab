package String_Handling;

abstract class LibraryItem 
{
    private int itemId;
    private String itemName;
    private boolean availability;

    public LibraryItem(int itemId, String itemName, boolean availability) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.availability = availability;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Abstract method to display item details
    public abstract void displayDetails();
}