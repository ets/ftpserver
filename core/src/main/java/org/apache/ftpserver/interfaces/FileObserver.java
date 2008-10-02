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

package org.apache.ftpserver.interfaces;

import org.apache.ftpserver.ftplet.FtpFile;

/**
 * This is the file related activity observer.
 *
 * @author The Apache MINA Project (dev@mina.apache.org)
 * @version $Rev$, $Date$
 */
public interface FileObserver {

    /**
     * User file upload notification.
     */
    void notifyUpload(FtpIoSession session, FtpFile file, long size);

    /**
     * User file download notification.
     */
    void notifyDownload(FtpIoSession session, FtpFile file, long size);

    /**
     * User file delete notification.
     */
    void notifyDelete(FtpIoSession session, FtpFile file);

    /**
     * User make directory notification.
     */
    void notifyMkdir(FtpIoSession session, FtpFile file);

    /**
     * User remove directory notification.
     */
    void notifyRmdir(FtpIoSession session, FtpFile file);

}
