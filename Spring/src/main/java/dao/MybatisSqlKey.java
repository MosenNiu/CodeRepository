package dao;

/**
 * Created by Mosen on 2017/10/12.
 */
public class MybatisSqlKey {

    public static final String INSERT_FACTORY = "insertFactory";
    public static final String INSERT_SHOES = "insertShoes";

    public static final String SELECT_FACTORY = "selectFactory";
    public static final String SELECT_SHOES_NO = "selectShoesByNo";
    public static final String SELECT_SHOES_FACTORY = "selectShoesByFactory";
    public static final String SELECT_SHOES_NO_FACTORY = "selectShoesNoAndFactory";
    //根据货号，厂家，颜色查指定货品
    public static final String SELECT_SHOES_ONE = "selectShoesOne";

    public static final String UPDATE_SHOES = "updateShoes";
    public static final String UPDATE_PICTURE = "updatePicture";
}
