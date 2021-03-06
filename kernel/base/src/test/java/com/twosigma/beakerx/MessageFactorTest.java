/*
 *  Copyright 2018 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx;

import com.twosigma.beakerx.kernel.msg.JupyterMessages;
import com.twosigma.beakerx.message.Header;
import com.twosigma.beakerx.message.Message;

import java.util.Arrays;
import java.util.List;

public class MessageFactorTest {

  public static final List<byte[]> MESSAGE_IDENTITIES = Arrays.asList("MessageIdentities123".getBytes());

  public static Message commMsg() {
    return msg(JupyterMessages.COMM_MSG);
  }

  public static Message msg(JupyterMessages type) {
    Message msg1 = new Message(new Header(type, "session1"));
    msg1.setIdentities(MESSAGE_IDENTITIES);
    return msg1;
  }
}
