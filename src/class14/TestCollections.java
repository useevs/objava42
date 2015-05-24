/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author shahzad
 */
public class TestCollections {

    public static void main(String[] args) {
        //              Sorted       Duplicate       Ordered
        // Set          No           Yes             No
        // List / Seq   No/Yes       Yes             Yes
        // Map          Yes          No              Yes

        // set -> HashSet, LinkedHashSet, TreeSet, EnumSet
        // list -> Vector, ArrayList, Stack, LinkedList, Queue, Enqueue
        // map -> Hashtable, HashMap, WeakHashMap, LinkedHashMap, IdentifyHashMap
        Vector<Person> vec = new Vector<>();
        vec.add(new Person(3, "One"));
        vec.add(new Person(2, "Two"));
        vec.add(new Person(3, "Three"));
        vec.add(new Person(4, "Four"));

        // Index Of, FromOffset
        System.out.println(vec.indexOf(new Person(3, null), 1));

        // Sort
        System.out.println(vec) ;
        Collections.sort(vec);
        System.out.println(vec) ;
        
        // Second Sort - Comparator
        Comparator<Person> nameCompare = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name) ;
            }
        }; 
        Collections.sort(vec, nameCompare);
        System.out.println(vec) ;
        
        // Reverse or Descending 
        Collections.reverse(vec);
        System.out.println(vec) ;
    }

    private static class Person implements Comparable<Person> {

        private Integer id;
        private String name;

        public Person(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" + "id=" + id + ", name=" + name + '}';
        }

        @Override
        public int hashCode() {
            int hash = 5;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Person other = (Person) obj;
            if (!Objects.equals(this.id, other.id)) {
                return false;
            }
//            if (!Objects.equals(this.name, other.name)) {
//                return false;
//            }
            return true;
        }

        @Override
        public int compareTo(Person o) {
            // 1 = Greater
            // 0 = Equal
            // -1 = Smaller / Less
            int idx = this.id.compareTo(o.id);
            return idx == 0 ? this.name.compareTo(o.name) : idx;
        }
    }

}
