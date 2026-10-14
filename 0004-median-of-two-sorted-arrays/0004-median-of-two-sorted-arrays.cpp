class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int ptr1 = 0;
        int ptr2 = 0;
        vector<int> v1;
        while(ptr1<nums1.size() && ptr2<nums2.size()){
            if(nums1[ptr1] <= nums2[ptr2]){
                v1.push_back(nums1[ptr1]);
                ptr1++;
            }
            else{
                v1.push_back(nums2[ptr2]);
                ptr2++;
            }
        }

        if(ptr1 == nums1.size()){
            while(ptr2 < nums2.size()){
                v1.push_back(nums2[ptr2]);
                ptr2++;
            }
        }
        else{
            while(ptr1 < nums1.size()){
                v1.push_back(nums1[ptr1]);
                ptr1++;
            }
        }

        if(v1.size()%2 == 0){
            int r = v1.size()/2;
            int l = r-1;

            float res = (v1[l]+v1[r])/2.0;
            cout<<v1[l]<<" "<<v1[r]<<endl;
            return res;
        }
        else{
            int k = v1.size()/2;
            float res = v1[k];
            return res;
        }

        for(auto i: v1){
            cout<<i<<endl;
        }

        return 0;
    }
};