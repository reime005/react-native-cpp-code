/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

#import "RNCPPCode.h"

#pragma mark - RNCPPCode

@implementation RNCPPCode

RCT_EXPORT_MODULE();

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

RCT_EXPORT_METHOD(multiply:(nonnull NSNumber*)a withB:(nonnull NSNumber*)b resolver:(RCTPromiseResolveBlock)resolve
withReject:(RCTPromiseRejectBlock)reject)
{
    long result = example::multiply([a longValue], [b longValue]);

    resolve(@{
              @"result": @(result)
    });
}

@end
