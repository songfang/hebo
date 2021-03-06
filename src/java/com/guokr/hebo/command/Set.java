package com.guokr.hebo.command;

import com.guokr.hebo.HeboCallback;
import com.guokr.hebo.HeboCommand;
import com.guokr.hebo.HeboEngine;

public class Set extends HeboCommand {

    @Override
    public String signature() {
        return "ss";
    }

    @Override
    public void invoke(HeboEngine engine, String key,String value, HeboCallback callback) {
        engine.set(callback, key, value);
    }

}
