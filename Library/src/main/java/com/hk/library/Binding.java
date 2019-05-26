package com.hk.library;

import android.app.Activity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by hk on 2019/5/26.
 */
public class Binding {
    public static void bind(Activity activity) {
        try {
            // new MainActivityBinding(activity);
            Class bindingClass = Class.forName(activity.getClass().getCanonicalName() + "$Binding");
            Class activityClass = Class.forName(activity.getClass().getCanonicalName());
            Constructor constructor = bindingClass.getDeclaredConstructor(activityClass);
            constructor.newInstance(activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
