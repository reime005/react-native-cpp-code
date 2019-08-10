/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @format
 * @flow
 * @jsdoc
 */

'use strict';

const {NativeModules} = require('react-native');

const RNCPPCode = NativeModules.RNCPPCode;

if (!RNCPPCode) {
  throw new Error(`[RNCPPCode]: NativeModule: RNCPPCode is null.

To fix this issue try these steps:

  • Rebuild and restart the app.

  • Run the packager with \`--clearCache\` flag.

  • Run \`pod install\` in the \`ios\` directory and then rebuild and re-run the app.
`);
}

/**
 * `RNCPPCode` is ...
 *
 * See ...
 */
const CPPCode = {
  /**
   */
  multiply: function(a: Number, b: Number): Promise<null> {
    return RNCPPCode.multiply(a, b);
  },
};

export default CPPCode;
