package oldjar.testordering;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.List;

/**
 * User: BAOBR
 * Date: 9/5/14
 */
public class testOrdering {

    @Test
    public void ordering() {
        List<String> stringList = Lists.newArrayList();
        stringList.add("111");
        stringList.add("222");
        stringList.add("333");
        stringList.add("sss");
        stringList.add("ddd");
        stringList.add("222");
        stringList.add("333");
        stringList.add("444");

        Ordering<String> stringOrdering = Ordering.natural();
        List<String> result = stringOrdering.sortedCopy(stringList);


        for (String s : result) {
            System.out.println(s);
        }
    }

}
