package io.dragonsbane.android.neurocog;

import java.io.Serializable;

import io.onemfive.data.Test;


/**
 * Created by Brian on 1/17/18.
 */

public interface ImpairmentModel extends Serializable {
    void evaluate(Test test);
}