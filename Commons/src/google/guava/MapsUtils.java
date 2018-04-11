package google.guava;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;

import java.util.Collection;
import java.util.List;

/**
 * Created by Mosen on 2018/1/11.
 */
public class MapsUtils {

    public static void main(String[] args) {
        //指定存储数量，创建扩容好的map集合
        Maps.newHashMapWithExpectedSize(1);
//        filter();
//        transform();
        orderedPermutations();
        permutations();
    }

    /**
     * 过滤
     */
    public static void filter() {
        List<String> list = Lists.newArrayList(null, "abcdef", null, "leveluplunch", "com", null);
        Collection<String> c = Collections2.filter(list, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                if (input != null && input.length() > 5)
                    return true;
                return false;
            }
        });
        System.out.println(list);
        System.out.println(c);
        c.remove("abcdef");
        System.out.println(list);
        System.out.println(c);
    }

    /**
     * 转换
     */
    public static void transform() {

        List<String> numbersAsStrings = Lists.newArrayList("1", "2", "3");

        Collection<Double> doubles = Collections2.transform(
                numbersAsStrings, new Function<String, Double>() {
                    @Override
                    public Double apply(String input) {
                        return new Double(input) + 0.1;
                    }
                });
        System.out.println(doubles);
        // doubles.add(8.8); // UnsupportedOperationException
        System.out.println(numbersAsStrings);
    }

    /**
     * 排列组合
     */
    public static void orderedPermutations() {

        List<Integer> vals = Lists.newArrayList(1, 2, 3);

        Collection<List<Integer>> orderPerm = Collections2.orderedPermutations(vals);

        for (List<Integer> val : orderPerm) {
            System.out.println(val);
        }
    }

    public static void permutations() {

        List<Integer> vals = Ints.asList(new int[]{1, 2, 3});

        Collection<List<Integer>> orderPerm = Collections2.permutations(vals);

        for (List<Integer> val : orderPerm) {
            System.out.println(val);
        }
    }
}
