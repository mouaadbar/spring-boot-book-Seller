package com.mouaad.bookV2.bookV2.service;


import com.mouaad.bookV2.bookV2.model.PurchaseHistory;
import com.sha.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

/**
 * @author sa
 * @date 3.07.2021
 * @time 18:14
 */
public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
