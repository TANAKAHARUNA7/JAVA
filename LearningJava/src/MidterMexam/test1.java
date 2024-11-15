package MidterMexam;

public class test1 {
    public static void main(String[] args) {
        char [] selectedItems = {'+','+','-'};
        char selectedItem = 0;

        int conCharCount = 0;
        for (int i = 0; i < selectedItems.length - 1 ; i++) {
            if (selectedItems[i] == selectedItems[i + 1]) {
                conCharCount++;

                selectedItem = selectedItems[i];
            }
        }



    }
}
