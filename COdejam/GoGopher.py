def sol():

    t = int(input())

    m_coor = []
    res = 2
    r_max = (t // 3)
    x, y = 1, 1
    while x > 0 and y > 0:

        print('{} 2'.format(res))

        x, y = [int(z) for z in input().split(' ')]

        s = (x, y)
        m_coor.append(s)

        if res < r_max and (res-1, 1) in m_coor and (res-1, 2) in m_coor and (res-1, 3) in m_coor:
            res = res + 1

for _ in range(int(input())):
    sol()
