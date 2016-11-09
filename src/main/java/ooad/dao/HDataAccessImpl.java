package ooad.dao;

import lombok.AllArgsConstructor;

import ooad.model.OTypes;
import ooad.model.RequestObject;
import ooad.model.RequestObjectVer2;

import java.util.function.BiFunction;
import java.util.function.Function;
import ooad.funclayer.DaoInputFunction;

/**
 * Created by x148128 on 08/11/2016.
 */
//@NoArgsConstructor
@AllArgsConstructor
public class HDataAccessImpl<T, ReqObject, ReqObjV2> implements HirearchyDataAccess<OTypes, RequestObject, RequestObjectVer2> {
    private OTypes oTypes;
    private RequestObject requestObject;
    private RequestObjectVer2 objectVer2;

    @Override
    public String getData(Function operation) {
        System.out.println(operation.apply(oTypes));
        return operation.toString();
    }

    @Override
    public String getData(BiFunction operation) {
        System.out.println(operation.apply(oTypes, requestObject));
        return operation.toString();
    }

    @Override
    public String getData(DaoInputFunction operation) {
        System.out.println(operation.performTask(oTypes, requestObject, objectVer2));
        return operation.toString();
    }

}
