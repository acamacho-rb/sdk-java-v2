package com.decidir.sdk.dto;

import java.io.Serializable;

/**
 * Created by biandra on 12/07/16.
 */
public class CardError implements Serializable{

    private CardErrorCode type;
    private CardErrorReason reason;

    public CardErrorCode getType() {
        return type;
    }

    public void setType(CardErrorCode type) {
        this.type = type;
    }

    public CardErrorReason getReason() {
        return reason;
    }

    public void setReason(CardErrorReason reason) {
        this.reason = reason;
    }
}
