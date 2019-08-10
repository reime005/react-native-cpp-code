/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.mariusreimer.rncppcode;

import android.util.Log;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = RNCPPCodeModule.TAG)
public final class RNCPPCodeModule
    extends ReactContextBaseJavaModule {

  public static final String TAG = "RNCPPCode";

  static {
    try {
      System.loadLibrary("cpp-code");
      Log.d(TAG, "-------- libcpp-code: loaded");
    } catch (Exception e){
      Log.d(TAG, "-------- libcpp-code: loaded");
    }
  }

  RNCPPCodeModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return TAG;
  }

  /**
   *
   */
  @ReactMethod
  public void multiply(final int a, final int b, final Promise promise) {
    long result = multiply(a, b);

    final WritableMap response = Arguments.createMap();

    response.putString("result", String.valueOf(result));

    promise.resolve(response);
  }

  public static native long multiply(long a, long b);
}
