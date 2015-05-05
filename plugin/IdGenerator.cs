using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Plugin
{
    public class IdGenerator: IIdGenerator
    {
        int id { get; set; }

        public void IdGenerator()
        {
            
        }

        public int getId()
        {
            Random rdm = new Random();
            id = rdm.Next() * 500;

            return id;
        }

        
    }
}
