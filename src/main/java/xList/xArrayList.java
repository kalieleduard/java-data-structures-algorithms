package xList;

public class xArrayList<E> implements xList<E> {

    private Object list[] = new Object[0];

    @Override
    public void add(E anE) {
        Object returnedList[] = new Object[list.length + 1];

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                returnedList[i] = list[i];
                continue;
            }
        }
    }

    @Override
    public void search(int anIndex) {

    }
}
