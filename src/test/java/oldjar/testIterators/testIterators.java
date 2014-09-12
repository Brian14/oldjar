package oldjar.testIterators;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import oldjar.testobject.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * User: BAOBR
 * Date: 9/12/14
 */
public class testIterators {
    List<Person> personList = Lists.newArrayList();


    @Before
    public void setup() {

        Person person1 = new Person(11,"wer1");
        Person person2 = new Person(12,"wer2");
        Person person3 = new Person(13,"wer3");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
    }

    @Test
    public void testUnmodify() {
        UnmodifiableIterator<Person> umPerson = Iterators.unmodifiableIterator(personList.iterator());

        //由此可见此处并不是真正的不可改动，而是仅仅不支持remove方法
        umPerson.next().setAge(444);

        umPerson.next();


    }


}
