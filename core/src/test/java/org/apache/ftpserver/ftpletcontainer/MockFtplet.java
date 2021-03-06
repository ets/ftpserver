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

package org.apache.ftpserver.ftpletcontainer;

import java.io.IOException;

import org.apache.ftpserver.ftplet.DefaultFtplet;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.FtpRequest;
import org.apache.ftpserver.ftplet.FtpSession;
import org.apache.ftpserver.ftplet.FtpletContext;
import org.apache.ftpserver.ftplet.FtpletResult;

/**
*
* @author The Apache MINA Project (dev@mina.apache.org)
* @version $Rev$, $Date$
*
*/
public class MockFtplet extends DefaultFtplet {

    protected static MockFtpletCallback callback = new MockFtpletCallback();

    public FtpletContext context;
    public boolean destroyed = false;
    
    public void destroy() {
        destroyed = true;
        
        callback.destroy();
    }

    public void init(FtpletContext ftpletContext) throws FtpException {
        this.context = ftpletContext;
        
        callback.init(ftpletContext);
    }

    public FtpletResult onAppendEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onAppendEnd(session, request);
    }

    public FtpletResult onAppendStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onAppendStart(session, request);
    }

    public FtpletResult onConnect(FtpSession session) throws FtpException,
            IOException {
        return callback.onConnect(session);
    }

    public FtpletResult onDeleteEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onDeleteEnd(session, request);
    }

    public FtpletResult onDeleteStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onDeleteStart(session, request);
    }

    public FtpletResult onDisconnect(FtpSession session) throws FtpException,
            IOException {
        return callback.onDisconnect(session);
    }

    public FtpletResult onDownloadEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onDownloadEnd(session, request);
    }

    public FtpletResult onDownloadStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onDownloadStart(session, request);
    }

    public FtpletResult onLogin(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onLogin(session, request);
    }

    public FtpletResult onMkdirEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onMkdirEnd(session, request);
    }

    public FtpletResult onMkdirStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onMkdirStart(session, request);
    }

    public FtpletResult onRenameEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onRenameEnd(session, request);
    }

    public FtpletResult onRenameStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onRenameStart(session, request);
    }

    public FtpletResult onRmdirEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onRmdirEnd(session, request);
    }

    public FtpletResult onRmdirStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onRmdirStart(session, request);
    }

    public FtpletResult onSite(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onSite(session, request);
    }

    public FtpletResult onUploadEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onUploadEnd(session, request);
    }

    public FtpletResult onUploadStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onUploadStart(session, request);
    }

    public FtpletResult onUploadUniqueEnd(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onUploadUniqueEnd(session, request);
    }

    public FtpletResult onUploadUniqueStart(FtpSession session, FtpRequest request)
            throws FtpException, IOException {
        return callback.onUploadUniqueStart(session, request);
    }
}
