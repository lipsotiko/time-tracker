package io.meraklis.icare.processors;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignatureConfig {
    private int page;
    private String signatureBase64;
    private int xPos;
    private int yPos;
    private int maxHeight;

    public int getYPos() {
        return yPos - (maxHeight / 2);
    }
}
