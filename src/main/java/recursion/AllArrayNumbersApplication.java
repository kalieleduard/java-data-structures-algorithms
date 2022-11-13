package recursion;

public class AllArrayNumbersApplication {
    private static final Object[] objectsArray = {
            1,
            2,
            3,
            new Object[]{4, 5, 6},
            7,
            new Object[]{8,
                    new Object[]{9, 10, 11,
                            new Object[]{12, 13, 14},
                    },
            },
            new Object[]{15, 16, 17, 18, 19,
                    new Object[]{20, 21, 22,
                            new Object[]{23, 24, 25,
                                    new Object[]{26, 27, 29}
                            }, 30, 31
                    }, 32
            }, 33
    };

    public static void main(String[] args) {
        printNumbers(objectsArray);
    }

    public static void printNumbers(final Object[] anArray) {
        for (final Object anObject : anArray) {
            if (anObject.getClass().isArray()) {
                printNumbers((Object[]) anObject);
            } else {
                System.out.println(anObject);
            }
        }
    }
}
