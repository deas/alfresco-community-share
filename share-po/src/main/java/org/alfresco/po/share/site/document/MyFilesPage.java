/*
 * #%L
 * share-po
 * %%
 * Copyright (C) 2005 - 2016 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software. 
 * If the software was purchased under a paid Alfresco license, the terms of 
 * the paid license agreement will prevail.  Otherwise, the software is 
 * provided under the following open source license terms:
 * 
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco.po.share.site.document;

import org.alfresco.po.RenderTime;
import org.alfresco.po.share.RepositoryPage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author nshah
 * Dated: 27/03/2014
 * Represent Myfiles option from header bar of share. 
 */
public class MyFilesPage extends RepositoryPage {
    
    private static Log logger = LogFactory.getLog(DocumentLibraryPage.class);

    @SuppressWarnings("unchecked")
    @Override
    public MyFilesPage render(RenderTime timer) {
        logger.info("Logged in to :"+this);
        super.render(timer);
        return this;
}   
    @SuppressWarnings("unchecked")
    @Override
    public MyFilesPage render() {
        return render(new RenderTime(maxPageLoadingTime));
    }
}
