/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ftpserver.clienttests;

import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.filesystem.nativefs.NativeFileSystemFactory;

/**
*
* @author The Apache MINA Project (dev@mina.apache.org)
* @version $Rev$, $Date$
*
*/
public class CdCaseInsensitiveTest extends CdTest {
    protected FtpServer createServer() throws Exception {
        FtpServer server = super.createServer();

        NativeFileSystemFactory fs = (NativeFileSystemFactory) server
                .getServerContext().getFileSystemManager();
        fs.setCaseInsensitive(true);

        return server;
    }

    public void testCWDCaseInsensitive() throws Exception {
        assertTrue(client.changeWorkingDirectory(TEST_DIR1.getName()
                .toUpperCase()));
        assertEquals("/dir1", client.printWorkingDirectory());

        assertTrue(client.changeWorkingDirectory(TEST_DIR_IN_DIR1.getName()
                .toUpperCase()));
        assertEquals("/dir1/dir3", client.printWorkingDirectory());

        assertTrue(client.changeWorkingDirectory("/DiR2"));
        assertEquals("/dir2", client.printWorkingDirectory());
    }

}
