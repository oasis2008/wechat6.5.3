package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class pq extends aqx {
    public long mrx;
    public String mry;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            aVar.C(2, this.mrx);
            if (this.mry == null) {
                return 0;
            }
            aVar.e(3, this.mry);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 += a.a.a.a.B(2, this.mrx);
            if (this.mry != null) {
                r0 += a.a.a.b.b.a.f(3, this.mry);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            pq pqVar = (pq) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        com.tencent.mm.ba.a eoVar = new eo();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = eoVar.a(aVar4, eoVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        pqVar.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    pqVar.mrx = aVar3.pMj.mI();
                    return 0;
                case 3:
                    pqVar.mry = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
