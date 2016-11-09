package ooad;

import ooad.dao.HDataAccessImpl;
import ooad.dao.HirearchyDataAccess;
import ooad.funclayer.DaoInputFunction;
import ooad.model.OTypes;
import ooad.model.RequestObject;
import ooad.model.RequestObjectVer2;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by x148128 on 08/11/2016.
 */
public class FancyUser {
    public static void main(String[] args) {
        FancyUser fancyUser = new FancyUser();
        fancyUser.lambdaUser();
    }

    public void lambdaUser() {
        HirearchyDataAccess officeDataAccess = getOfficeHa();
        HirearchyDataAccess terrDataAccess = getOfficeTerr();

        System.out.println(officeDataAccess.getData(conceptOne));
        System.out.println(terrDataAccess.getData(conceptTwo));
        System.out.println(officeDataAccess.getData(conceptThree));
    }

    private HirearchyDataAccess getOfficeTerr() {
        RequestObject ro = RequestObject.builder().id("20").name("Rana Das").address("Rana's Territory address").build();
        RequestObjectVer2 rov2 = RequestObjectVer2.builder().id("25").name("Rana Das").address("Rana's Territory address").email("rd@e.k").build();
        HirearchyDataAccess dataAccess = new HDataAccessImpl<OTypes, RequestObject, RequestObjectVer2>(OTypes.TERRIROTY, ro, rov2);
        return dataAccess;
    }

    private HirearchyDataAccess getOfficeHa() {
        RequestObject ro = RequestObject.builder().id("1").name("Rana").address("Rana's Office address").build();
        RequestObjectVer2 rov2 = RequestObjectVer2.builder().id("2").name("Rana Das").address("Rana's Territory address").email("rd2@eh.kom").build();
        HirearchyDataAccess dataAccess = new HDataAccessImpl<OTypes, RequestObject, RequestObjectVer2>(OTypes.OFFICE, ro, rov2);
        return dataAccess;
    }

    public Function conceptOne = (t) -> {
        System.out.println("calling concept 1 with " + t.toString());
        return 1;
    };

    public BiFunction conceptTwo = (t, v) -> {
        System.out.println("calling concept 2 with " + t.toString());
        return 2;
    };

    public DaoInputFunction conceptThree = (t, v, w) -> {
        System.out.println("calling concept 3 with " + t.toString());
        return 3;
    };
}
