/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.idp.core.spi;

import io.mosip.idp.core.dto.ClientDetailCreateRequest;
import io.mosip.idp.core.dto.ClientDetailResponse;
import io.mosip.idp.core.dto.ClientDetailUpdateRequest;
import io.mosip.idp.core.exception.IdPException;

public interface ClientManagementService {

    /**
     * API to register relying party client
     * @param clientDetailCreateRequest
     * @return
     * @throws IdPException
     */
    ClientDetailResponse createOIDCClient(ClientDetailCreateRequest clientDetailCreateRequest) throws IdPException;

    /**
     * API to update registered relying party client
     * @param clientId
     * @param clientDetailCreateRequest
     * @return
     * @throws IdPException
     */
    ClientDetailResponse updateOIDCClient(String clientId, ClientDetailUpdateRequest clientDetailCreateRequest) throws IdPException;

}
