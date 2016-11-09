package ooad.dao;

import ooad.funclayer.DaoInputFunction;
import ooad.model.OTypes;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by x148128 on 08/11/2016.
 */
public interface HirearchyDataAccess<T extends OTypes, ReqObject, ReqObjV2> {
    // accepts a function with one Parameter
    String getData(Function operation);
    // accepts a function with two Parameters
    String getData(BiFunction operation);
    // accepts a function with 3 Parameter ( this is defined by us)
    String getData(DaoInputFunction operation);
}
