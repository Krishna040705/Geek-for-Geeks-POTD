class Solution {
    static findPages(arr, k) {
        let n = arr.length;
        if (k > n) return -1;
        let l = Math.min(...arr), h = arr.reduce((sum, val) => sum + val, 0);
        let res = h;

        while (l <= h) {
            let mid = Math.floor((l + h) / 2);
            if (this.canAllocate(arr, mid, k)) {
                res = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    static canAllocate(arr, mid, k) {
        let st = 1, pg = 0;
        for (let i of arr) {
            if (i > mid) return false;
            if (i + pg > mid) {
                st++;
                pg = i;
                if (st > k) return false;
            } else {
                pg += i;
            }
        }
        return true;
    }
}

// Example usage
let arr = [12, 34, 67, 90];
let k = 2;
console.log(Solution.findPages(arr, k));
